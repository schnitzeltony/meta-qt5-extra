SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig features_check mime-xdg

DEPENDS += "libfm-qt"

SRCREV = "8947db9cb4b461c947c872af417a79aad81ad66c"
PV = "0.15.0"

FILES_${PN} += " \
    ${datadir}/${BPN}/lxqt/settings.conf \
"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
