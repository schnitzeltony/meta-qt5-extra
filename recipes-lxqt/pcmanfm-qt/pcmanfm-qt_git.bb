SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check

DEPENDS += "qtx11extras glib-2.0 libxcb libfm menu-cache"

SRCREV = "1af5a3d1e71994cb80b3f367f8bf0c2fcd109ece"
PV = "0.9.0+git${SRCPV}"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash udisks eject"
