(defproject gorillalabs.tesla/neo4j "0.0.0"
  :monolith/inherit true
  :middleware [leiningen.v/dependency-version-from-scm
               leiningen.v/version-from-scm
               leiningen.v/add-workspace-data]

  :plugins
  [[lein-monolith "1.4.0"]
   [com.roomkey/lein-v "7.1.0"]
   ]

  :description "A neo4j tesla-component"

  :dependencies [[gorillalabs.tesla/core nil]
                 [com.taoensso/timbre "4.6.0"]
                 [gorillalabs/neo4j-clj "0.3.2"]])
