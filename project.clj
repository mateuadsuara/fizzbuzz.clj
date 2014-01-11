(defproject fizzbuzz "0.1.0-SNAPSHOT"
  :description "The fizzbuzz kata"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [expectations "1.4.52"]]
  :plugins [[lein-autoexpect "1.2.1"]]
  :main ^:skip-aot fizzbuzz.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
