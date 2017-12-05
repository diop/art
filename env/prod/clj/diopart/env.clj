(ns diopart.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[diopart started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[diopart has shut down successfully]=-"))
   :middleware identity})
