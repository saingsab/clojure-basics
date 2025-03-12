(ns b03-variables-scope.problems)

(def x 1)

(comment (let [x 0]
  (while (< x 10)
      (println x)
      (def x (inc x)))))

(dotimes [x 10]
  (println x))

(let [x (atom 0)]
  (while (< @x 10)
    (println @x))
    (swap! x inc))

(defn double-values [mp]
  (into {} (map (fn [[k v]]
                  [k (* 2 v)]) mp)))