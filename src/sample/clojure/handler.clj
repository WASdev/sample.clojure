(ns sample.clojure.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Hello from a Clojure app running on Liberty!")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
