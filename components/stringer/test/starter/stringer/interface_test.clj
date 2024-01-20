(ns starter.stringer.interface-test
  (:require [clojure.test :refer [deftest is testing]]
            [starter.stringer.interface :as stringer]))

(deftest concat-test
  (testing "Concatenating two strings"
    (let [s1 "Hello "
          s2 "World!"]
      (is (= (str s1 s2) (stringer/my-concat s1 s2))))))
