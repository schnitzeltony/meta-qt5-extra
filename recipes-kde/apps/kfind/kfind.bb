SUMMARY = "KDE file find utility"
LICENSE = "GPLv2 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
"

inherit kde-apps gettext gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    karchive \
    kfilemetadata \
    ki18n \
    kio \
    ktextwidgets \
    kwidgetsaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "becdd1a453b3070cce0061d3d5f400e4"
SRC_URI[sha256sum] = "ab90ee3694cbea7dfa1b770c731606c127de3d8df739474c2cac42e9b53111ee"

FILES_${PN} += " \
    ${datadir}/icons \
"
