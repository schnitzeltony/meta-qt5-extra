SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check

DEPENDS += "libfm-qt"

SRCREV = "9a91aa161936713bb317e77f7973d707c284e370"
PV = "0.14.1"

FILES_${PN} += " \
    ${datadir}/${BPN}/lxqt/settings.conf \
"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
