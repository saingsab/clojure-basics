(ns b03-variables-scope.function-basic)

;;Destructor
(fn [[a b c]]
  (+ a b))

;; normal function
(defn fname []
  :my-name)

;;private function
(defn- private-fname []
  :my-private-name)

;;Short hand
(fn [x] (+ x 9))
;;above function is equal to
#(+ %1 9)
;;For multi argument function
#(+ %1 %2 9)
;;sample
(map #(* % 9) (range 10)) ;;(0 9 18 27 36 45 54 63 72 81)

;;fib
()
