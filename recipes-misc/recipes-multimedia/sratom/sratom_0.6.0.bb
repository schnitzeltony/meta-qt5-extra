SUMMARY = "Sratom is a library for serialising LV2 atoms to and from RDF"
HOMEPAGE = "http://drobilla.net/software/sratom"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=ebc7934238811c788037421c6c548ddf"

inherit waf

DEPENDS += "lv2 serd sord"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "76f085e6d41bba57f4dc2a5ffeff9dde"
SRC_URI[sha256sum] = "440ac2b1f4f0b7878f8b95698faa1e8f8c50929a498f68ec5d066863626a3d43"
