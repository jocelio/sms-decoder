(ns sms-decoder.core
  (:gen-class)
  (require [clojure.string :as str]))

(def alphabet (map char (range (int \A) (inc (int \Z)))))

(defn gfl [x](if (>= x 8) (inc (* 3 (- x 2))) (* 3 (- x 2))))

(defn to-int [ch](Integer/parseInt (str ch)))

(defn parse [msg]
  "This function receives a string that represents the pushed keys and parse it to a message"
  (str/join
      (map #(if (>= % 0) (nth alphabet %) " ")
                (map #(+ (gfl (to-int (first %))) (dec (to-int (second %))))
                   (map #(vector (first %) (count %))
                          (filter #(and (not (.contains % " ")) (not (nil? (re-matches #"[^1]+" %))))
                            (.split msg "(?<=(.))(?!\\1)")))))))

 