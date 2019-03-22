SUMMARY = "C library for storing RDF data in memory"
HOMEPAGE = "http://drobilla.net/software/sord"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b8d060e6d32fbd53684f9dc0443b6a3"

inherit waf pkgconfig

DEPENDS += "libpcre serd"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "eb1d1c62ffb5153d5e1f5d12a3b7279b"
SRC_URI[sha256sum] = "09f51174dd8f3efbd95f44f0bb0b165f08e066e052d40095de59de787987da8d"
