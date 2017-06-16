(ns sms-decoder.core
  (:gen-class)
  (require [clojure.string :as str]))

(def alphabet (map char (range (int \A) (inc (int \Z)))))

(defn show [message] (seq (.split message "(?<=(.))(?!\\1)")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (print (show "333277778" )))
