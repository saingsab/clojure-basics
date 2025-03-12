(ns b03-variables-scope.core)

;;Global Scope
(def x "my name is x")
(defn f [])
(defonce p "p")
(defn  this-defs []
  (def some-var "hello!")) ;; Not recommending

;;Let scope

(let [x 1
      y 2
      z (+ x y)]
  z)

;;Function argument scope
(defn my-fn [a b c]
  (let [a 1]
    (+ a b c)))
