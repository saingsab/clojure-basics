(ns b03-collections.vector)

;;Vectors
;;Vector is useful because we can evaluate the elements in the vector in order.
;;Vector mantain order
(def v1 [1 2 3 4 5])

;;Evaluate
[1 2 3 (* 2 2)] ;;=> [1 2 3 4]

;;declare a vector
(vector 1 2 3 4 5) ;;=> [1 2 3 4 5]

;;create anything of vector
[1 :a "ear" 0 nil] ;;=> [1 :a "ear" 0 nil]

;;convert from list
(vec '(1 2 3 4 5)) ;;=> [1 2 3 4 5]
(vec (list 1 2 3 4 5)) ;;=> [1 2 3 4 5]

;;convert from map
(vec {:a 1 :b 2 :c 3}) ;;=> [[:a 1] [:b 2] [:c 3]]

;;Access Parterns

;;Order
(conj [1 2 3 4] :a ) ;;=> [1 2 3 4 :a]

;;Random access by index
(def v [:a :b :c :d :e :f :g])
(get v 3) ;;=> :d

;;If the type is wrong it's rill just return nil , Vector don't throw an exception
(get v 10) ;;=> nil
(get v :ff) ;;=> nil

;;Vector can store duplicates values
(def v2 [1 2 3 4 5 4]) ;;=> [1 2 3 4 5 4]
(conj v2 4) ;;=> [1 2 3 4 5 4 4]

;;Equalitiy checks
(= [1 2 3 4] (list [1 2 3 (* 2 2)])) ;; false
(= [1 2 3 4] [1 2 3 (* 2 2)]) ;; true
(= [1 2 3] [1 2 3]) ;;=> true

;;Containment check
;;Containment check is O(n) for vectors, checking the index actually
(def number [1 2 3 4 5])
(contains? number 3) ;;=> true
(contains? number 5) ;;=> false

