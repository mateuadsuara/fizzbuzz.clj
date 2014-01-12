(ns fizzbuzz.core
  (:gen-class))

(defn divisible-by? [divider number]
  (zero? (mod number divider)))

(defn has-digit? [digit number]
  (contains? (set (str number))
             (first (str digit))))

(defn stringify [factor string number]
  (when (or (divisible-by? factor number)
            (has-digit? factor number))
      string))

(defn join-strings [a b]
  (when-not (= a b nil)
    (str a b)))

(defn fizzbuzz [number]
  (or
    (join-strings
      (stringify 3 "fizz" number)
      (stringify 5 "buzz" number))
    number))

(defn -main [& args]
  (apply println (map fizzbuzz (range 1 101))))
