SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 pkgconfig

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a7bbafb3ff11f0371b1c56f39b60d169"
SRC_URI[sha256sum] = "3089951c69845c4f6d1848bbbaf05116a72d4207a9f2d63b063a76c78549bf45"

do_configure_append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*Targets*.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}
