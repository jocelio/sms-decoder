(ns sms-decoder.core-test
  (:require [clojure.test :refer :all]
            [sms-decoder.core :refer :all]))

(deftest parse-test
  (testing "Parse sms keypush code"
    (is (= (parse "333277778") "FAST"))
    (is (= (parse "11166611144411") "OI"))
    (is (= (parse "222 277772") "CASA"))
    (is (= (parse "886207777336683366222 20555666 6642") "UMA SENTENCA LONGA"))
    (is (= (parse "0123456789") " ADGJMPTW"))
    (is (= (parse "") ""))))
