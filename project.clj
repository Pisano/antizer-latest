(defproject antizer-latest "0.1.0"
  :description "Antizer Latest"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [cljsjs/antd "3.19.0-0"]
                 [cljsjs/moment "2.17.1-1"]]
  :plugins [[lein-codox "0.10.3"]]
  :codox {:language    :clojurescript
          :metadata    {:doc/format :markdown}
          :output-path "doc/dist/latest/api"
          :namespaces  [antizer.core antizer.reagent antizer.rum]})
