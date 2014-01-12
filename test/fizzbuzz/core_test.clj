(ns fizzbuzz.core-test
  (:require [fizzbuzz.core :refer :all]
            [expectations :refer :all]))

(expect 1 (fizzbuzz 1))
(expect 2 (fizzbuzz 2))
(expect "fizz" (fizzbuzz 3))
(expect "fizz" (fizzbuzz 6))
(expect "buzz" (fizzbuzz 5))
(expect "buzz" (fizzbuzz 10))
(expect "fizzbuzz" (fizzbuzz 15))
(expect "fizzbuzz" (fizzbuzz 30))
(expect "fizz" (fizzbuzz 13))
(expect "buzz" (fizzbuzz 52))

(expect true (divisible-by? 3 3))
(expect false (divisible-by? 3 4))
(expect true (divisible-by? 5 5))
(expect true (divisible-by? 3 6))

(expect true (has-digit? 3 13))
(expect false (has-digit? 3 12))
(expect true (has-digit? 3 31))
(expect true (has-digit? 5 52))
(expect false (has-digit? 5 42))

(expect nil (stringify 3 "fizz" 2))
(expect "fizz" (stringify 3 "fizz" 3))
(expect "fizz" (stringify 3 "fizz" 6))

(expect nil (join-strings nil nil))
(expect "a" (join-strings "a" nil))
(expect "b" (join-strings nil "b"))
(expect "ab" (join-strings "a" "b"))
