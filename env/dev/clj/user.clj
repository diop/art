(ns user
  (:require 
            [mount.core :as mount]
            diopart.core))

(defn start []
  (mount/start-without #'diopart.core/repl-server))

(defn stop []
  (mount/stop-except #'diopart.core/repl-server))

(defn restart []
  (stop)
  (start))


