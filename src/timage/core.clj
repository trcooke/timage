(ns timage.core
  (:gen-class)
  (:use mikera.image.core)
  (:use mikera.image.filters)
  (:use mikera.image.colours))

(defn -main
  [& args]
  (def kat (load-image-resource "../resources/lambda-kat-250.png"))
  (def kat2 (copy kat))
  (def pixels (get-pixels kat2))
  (dotimes [i 1024]
    (aset pixels i (rand-colour)))
  (set-pixels kat2 pixels)
  (save kat2 "output.png" :quality 0.9 :progressive true))
