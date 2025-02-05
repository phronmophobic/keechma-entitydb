(ns keechma.entitydb.util)

(defn vec-remove
  "remove elem in coll"
  [pos coll]
  (vec (concat (subvec (vec coll) 0 pos)
               (subvec (vec coll) (inc pos)))))

(defn log
  ([args] #_(log "" args))
  ([text args] #_(js/console.log text (with-out-str (cljs.pprint/pprint args)))))
