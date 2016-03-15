(defproject escaton-server "0.1.0-SNAPSHOT"
  :description "This is a server prototype of Escaton"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.immutant/web "2.1.3"]
                 [com.taoensso/sente "1.8.1"]
                 [compojure "1.5.0"]]
  :MAIN ^:skip-aot escaton-server.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
