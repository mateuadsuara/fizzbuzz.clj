(ns fizzbuzz.core
  (:gen-class))

(defn divisible-by? [divider number]
  (zero? (mod number divider)))

(defn has-digit? [digit number]
  (contains? (set (str number))
             (first (str digit))))

(defn make-label [factor string]
  (fn [number]
    (when (or (divisible-by? factor number)
            (has-digit? factor number))
      string)))
(def fizz (make-label 3 "fizz"))
(def buzz (make-label 5 "buzz"))

(defn label-seq [number]
  (seq (keep #(% number) [fizz buzz])))

(defn fizzbuzz [number]
  (if-let [labels (label-seq number)]
    (apply str labels)
    number))

(defn -main [& args]
  (doseq [number (range 1 101)]
    (println (fizzbuzz number))))
