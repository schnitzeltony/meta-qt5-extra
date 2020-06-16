SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "de38a1881faf5d6f423bac630712204a"
SRC_URI[sha256sum] = "b2e5e2a8b8fe2e9fb22bb7dc77177a975727991c6c0ee19d5a9b0a2ab513531d"

do_configure_append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*Targets*.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}

RPROVIDES_${PN} += "libmm-qt"
RREPLACES_${PN} += "libmm-qt"
RCONFLICTS_${PN} += "libmm-qt"
