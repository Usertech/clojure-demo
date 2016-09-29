(defproject clojure-demo "0.1.0-SNAPSHOT"
  :description "A playground for a Clojure workshop"
  :url "https://github.com/Usertech/clojure-demo"
  :license {:name "MIT"
            :url "https://github.com/Usertech/clojure-demo/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clojure-demo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
