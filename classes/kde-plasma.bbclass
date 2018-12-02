inherit kde-base

PLASMA_VERSION = "5.14.4"

SRC_URI = "${KDE_MIRROR}/stable/plasma/${PV}/${BPN}-${PV}.tar.xz"

DEPENDS += " \
    kwayland \
"
