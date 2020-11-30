(defproject dialog "0.1.0-SNAPSHOT"
  :dependencies [
    [org.clojure/clojure "1.10.1"]
    [ring/ring-core "1.8.2"]
    [org.immutant/immutant "2.1.10"]
    [javax.servlet/javax.servlet-api "4.0.1"]
    [compojure "1.6.2"]
]
  :repl-options {:init-ns dialog.server}
  :main dialog.server)
