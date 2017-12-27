SUMMARY = "C library providing simple use of LV2 plugins"
HOMEPAGE = "http://drobilla.net/software/lilv"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7aceb3a3edc99517b08f5cdd557e11fb"

inherit waf bash-completion pkgconfig

DEPENDS += "lv2 serd sord sratom"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "cae7e1700f83b0f1272f437919a68458"
SRC_URI[sha256sum] = "f7ec65b1c1f1734ded3a6c051bbaf50f996a0b8b77e814a33a34e42bce50a522"

EXTRA_OECONF = "--configdir=${sysconfdir}"
