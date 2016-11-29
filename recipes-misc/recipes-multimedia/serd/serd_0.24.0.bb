SUMMARY = "C library for RDF syntax which supports accessing Turtle and NTriples"
HOMEPAGE = "http://drobilla.net/software/serd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b8d060e6d32fbd53684f9dc0443b6a3"

inherit waf

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "3f7c5fb104908bb0c6f7db554836ba63"
SRC_URI[sha256sum] = "8cfb8ade8d9a6f784da6e00ac05a28b7de440df5d2513796cd34aaa2754f6a6c"
