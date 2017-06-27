(ns sms-decoder.core
  (:gen-class)
  (require [clojure.string :as str]))

(def alphabet "Returns a list with the alphabet" (map char (range (int \A) (inc (int \Z)))))

(defn gal [x] "Get an alphabet letter in position x" (nth alphabet x))

(defn gfl [x] "Returns the index of the first letter for the given button"
  (if (>= x 8) (inc (* 3 (- x 2))) (* 3 (- x 2))))

(defn to-int [ch](Integer/parseInt (str ch)))

(defn parse [msg] (str/join (map #(gal %)
                      (map #(+ (gfl (to-int (first %))) (dec (to-int (second %))))
                          (map (fn [%] (list (first %) (count %)))
                              (seq (.split msg "(?<=(.))(?!\\1)")))))))

(defn -main
  [& args]
  (print (parse "333277778")))
  ;(print (parse "222 277772")))

