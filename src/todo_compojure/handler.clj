(ns todo-compojure.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
           (GET "/" [] (pr-str {:hello :world}))
           (GET "/2" [] (let [x (+ 1 1)]
                          (pr-str (+ 1 x))))
           (GET "/task" [] (pr-str {:task "Write a ClojureScript webapp" :done false}))
           (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
