SUMMARY = "C library providing simple use of LV2 plugins"
HOMEPAGE = "http://drobilla.net/software/lilv"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b8d060e6d32fbd53684f9dc0443b6a3"

inherit waf bash-completion

DEPENDS += "lv2 serd sord sratom"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "1d70964653027ba224c9f76abc0ee420"
SRC_URI[sha256sum] = "fa60de536d3648aa3b1a445261fd77bd80d0246a071eed2e7ca51ea91a27fb9e"

EXTRA_OECONF = "--configdir=${sysconfdir}"
