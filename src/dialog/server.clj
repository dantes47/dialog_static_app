(ns dialog.server
  (:require
    [immutant.web :as web]))

(def app
  (fn [req]
    { :status 200
       :body "Server is running on port 8888.." }))



(defn -main [& args]
  (web/run #'app { :port 8888 }))

;; Starting server..
(-main)