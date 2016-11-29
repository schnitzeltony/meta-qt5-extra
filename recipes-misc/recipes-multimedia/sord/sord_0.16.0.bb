SUMMARY = "C library for storing RDF data in memory"
HOMEPAGE = "http://drobilla.net/software/sord"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b8d060e6d32fbd53684f9dc0443b6a3"

inherit waf

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "010313c3baf5b8a4a639e9ee45310af6"
SRC_URI[sha256sum] = "9d3cb2c9966e93f537f37377171f162023cea6784ca069699be4a7770c8a035a"
