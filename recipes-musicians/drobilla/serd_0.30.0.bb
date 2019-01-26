SUMMARY = "C library for RDF syntax which supports accessing Turtle and NTriples"
HOMEPAGE = "http://drobilla.net/software/serd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7aceb3a3edc99517b08f5cdd557e11fb"

inherit waf

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "82243362b8b5a47dd46dac7ae893f562"
SRC_URI[sha256sum] = "6efb0efa5c2155e6bbac941cddeeabb7ed26d70a57d24178894ff169d8f6cefb"
