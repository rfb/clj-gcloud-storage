(defproject com.oscaro/clj-gcloud-storage "0.209-2.0-SNAPSHOT"
  :description "Clojure wrapper for google-cloud-storage Java client"
  :url "https://github.com/oscaro/clj-gcloud-storage"
  :license {:name "Eclipse Public License"
            :url  "https://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories [["snapshots" {:url "https://repo.clojars.org"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]
                        ["releases"  {:url "https://repo.clojars.org"
                                      :creds :gpg}]]
  :managed-dependencies
  ;; Google “Bill of Materials” (BOM) defines a combination of
  ;; dependency versions that work well with each other.
  ;;
  ;; based on versions from
  ;;   https://mvnrepository.com/artifact/com.google.cloud/google-cloud-bom/0.209.0
  ;; which corresponds to
  ;;   https://mvnrepository.com/artifact/com.google.cloud/libraries-bom/26.28.0
  [[com.google.cloud/google-cloud-bom "0.209.0"
    :extension "pom"
    :scope "import"]
   [com.google.cloud/google-cloud-shared-dependencies "3.20.0"
    :extension "pom"
    :scope "import"]]
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.oscaro/clj-gcloud-common "0.209-1.0"]
                 [com.google.cloud/google-cloud-nio "0.127.8"]
                 [com.google.cloud/google-cloud-storage "2.30.1"]
                 [org.clojure/tools.logging "1.2.4"]]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "1.4.4"]]
                   :global-vars {*warn-on-reflection* true}}}
  :repl-options {:init-ns user})
