(ns b03-variables-scope.daynamic-scope)

(def ^:dynamic dynamic nil)
(def static nil)

(defn print-them []
  (println  "Dynamic:" dynamic)
  (println "Static:" static))

(let [static "Hello"
      dynamic "Hello"]
  (print-them))

(def ^:dynamic db nil)

(defn lookup-user [db user-id]
  (get db user-id))

(defn user-handler [user-id]
  (lookup-user db user-id))