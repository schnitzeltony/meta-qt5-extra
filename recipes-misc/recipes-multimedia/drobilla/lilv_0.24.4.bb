SUMMARY = "C library providing simple use of LV2 plugins"
HOMEPAGE = "http://drobilla.net/software/lilv"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7aceb3a3edc99517b08f5cdd557e11fb"

inherit waf bash-completion pkgconfig

DEPENDS += "lv2 serd sord sratom"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "fb340958a6df5a683bf25e291493dc4d"
SRC_URI[sha256sum] = "c33b84b7a6e8e8fffb412fbcd6f69e59ca297ef3e29d829249b4ccc94f634438"

EXTRA_OECONF = "--configdir=${sysconfdir} --dyn-manifest"
