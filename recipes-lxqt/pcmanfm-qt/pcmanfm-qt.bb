SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig features_check mime-xdg

DEPENDS += "libfm-qt"

SRCREV = "bd258997813e26efb76495293704a100fc025b5c"
PV = "0.15.1"

FILES_${PN} += " \
    ${datadir}/${BPN}/lxqt/settings.conf \
"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
