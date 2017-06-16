(ns sms-decoder.core
  (:gen-class)
  (require [clojure.string :as str]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(def alphabet (map char (range (int \A) (inc (int \Z)))))

(defn show [message] (str/split message #"(?<=(.))(?!\\1)"))
