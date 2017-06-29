# sms-decoder

A Clojure Solution for this problem:
http://fastsolucoes.com.br/blog/wp-content/uploads/2013/06/fast-prog-remoto-sms.pdf



## Usage

    $ java -jar sms-decoder-0.1.0-standalone.jar [args]

## Examples

```
(deftest parse-test
  (testing "Parse sms keypress code"
    (is (= (parse "333277778") "FAST"))
    (is (= (parse "11166611144411") "OI"))
    (is (= (parse "222 277772") "CASA"))
    (is (= (parse "886207777336683366222 20555666 6642") "UMA SENTENCA LONGA"))
    (is (= (parse "0123456789") " ADGJMPTW"))
    (is (= (parse "") ""))))

```
## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
