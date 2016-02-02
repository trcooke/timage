(ns timage.core
  (:gen-class)
  (:use mikera.image.core))

(def kat (load-image-resource "../resources/lambda-kat-250.png"))

(defn -main
  [& args]
  (show kat))
