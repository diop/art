(ns diopart.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [diopart.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[diopart started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[diopart has shut down successfully]=-"))
   :middleware wrap-dev})
