(ns fizzbuzz.core
  (:gen-class))

(defn divisible-by? [divider number]
  (= (mod number divider) 0))

(defn has? [content container]
  (= true
     (some #(= (str content) (str %))
           (seq (str container)))))

(defn stringify [factor string number]
  (if (or (divisible-by? factor number)
          (has? factor number))
      string))

(defn join-strings [a b]
  (let [joined (str a b)]
    (if (empty? joined)
      nil
      joined)))

(defn fizzbuzz [number]
  (or
    (join-strings
      (stringify 3 "fizz" number)
      (stringify 5 "buzz" number))
    number))

(defn -main [& args]
  (apply println (map fizzbuzz (range 1 101))))
