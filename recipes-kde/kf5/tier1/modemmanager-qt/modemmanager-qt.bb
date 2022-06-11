SUMMARY = "Qt wrapper for ModemManager API"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 pkgconfig

DEPENDS += "modemmanager"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "7928dc36bad38a9721305d59bb6d318e35118843001c21aa8802ce11ce11bff2"

do_configure:append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*Targets*.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}

RPROVIDES:${PN} += "libmm-qt"
RREPLACES:${PN} += "libmm-qt"
RCONFLICTS:${PN} += "libmm-qt"
