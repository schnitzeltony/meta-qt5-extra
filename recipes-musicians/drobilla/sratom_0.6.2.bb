SUMMARY = "Sratom is a library for serialising LV2 atoms to and from RDF"
HOMEPAGE = "http://drobilla.net/software/sratom"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=ebc7934238811c788037421c6c548ddf"

inherit waf pkgconfig

DEPENDS += "lv2 serd sord"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "aa3c540032da43cf6cf68f684983d7f5"
SRC_URI[sha256sum] = "0a514a55d6b6cb7b5d6f32d1dcb78a1e6e54537fa22fce533e4ef6adf240e853"
