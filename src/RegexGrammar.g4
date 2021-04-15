grammar RegexGrammar;

re           :    simpleRe  #SimpleReRe
             |    union    #UnionRe
             ;

union        :    simpleRe'|'re
             ;

simpleRe     :    (basicRe)         #BasicReSimpleRe
             |    (concatenation)   #ConcatenationSimpleRe
             ;

concatenation:    (basicRe)(simpleRe)
             ;

basicRe      :    (star)            #StarBasicRe
             |    (plus)            #PlusBasicRe
             |    (elementaryRe)    #ElementaryReBasicRe
             ;

star         :    (elementaryRe) '*'
             ;

plus         :    (elementaryRe) '+'
             ;

elementaryRe :    (group)       #GroupElementaryRe
             |    (any)         #AnyElementaryRe
             |    (eos)         #EosElementaryRe
             |    (letra)       #LetraElementaryRe
             |    (set)         #SetElementaryRe
             ;

group        :    '(' (re) ')'  #ReGroup
             ;

any          :    '.'
             ;

eos          :    '$'
             ;

letra        :    CHAR
             ;

CHAR         :    [a-z]
             ;

set          :    '[' (setItems) ']'
             ;

setItems     :    (setItem)             #SetItemSetItems
             |    (setItem) (setItems)  #SetItemsSetItems
             ;

setItem      :    (range)       #RangeSetItem
             |    (letra)       #LetraSetItem
             ;

range        :    (letra) '-' (letra)
             ;

WS: [ \r\n\t]+ -> skip;