SUMMARY = "C library for RDF syntax which supports accessing Turtle and NTriples"
HOMEPAGE = "http://drobilla.net/software/serd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b8d060e6d32fbd53684f9dc0443b6a3"

inherit waf

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "21480095ad8919d4716bbd1a1bfc36c9"
SRC_URI[sha256sum] = "1df21a8874d256a9f3d51a18b8c6e2539e8092b62cc2674b110307e93f898aec"
