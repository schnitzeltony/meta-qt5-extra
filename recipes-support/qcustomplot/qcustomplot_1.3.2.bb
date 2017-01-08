SUMMARY = "QCustomPlot is a Qt C++ widget for plotting and data visualization"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://GPL.txt;md5=d32239bcb673463ab874e80d47fae504"

# At the beginning we had to go backwards
PE = "1"

DEPENDS += " \
    qtbase \
"
SRC_URI = " \
    http://www.qcustomplot.com/release/${PV}/QCustomPlot-source.tar.gz;name=source \
    http://www.qcustomplot.com/release/${PV}/QCustomPlot-sharedlib.tar.gz;name=pro \
    file://qcustomplot-qt5.pc \
"
SRC_URI[source.md5sum] = "1f673ac2347bebafa93e735550ca4303"
SRC_URI[source.sha256sum] = "a3649824c6d2d08efb0b54629e6ffe4cc57fa08ad9eb9f39edbb0c30b9659b51"

SRC_URI[pro.md5sum] = "82955a71538b18c23a320047ac32eace"
SRC_URI[pro.sha256sum] = "18af836d2ac32f0dc2a4b1485c3038f4f5f3acf07550d86077ba5871e54bb269"

S = "${WORKDIR}/qcustomplot-source"

inherit qmake5

do_configure_prepend() {
    cp ${WORKDIR}/qcustomplot-sharedlib/sharedlib-compilation/sharedlib-compilation.pro ${S}
    sed -i 's:../../qcustomplot:qcustomplot:g' ${S}/sharedlib-compilation.pro
}

do_install() {
    install -d ${D}${libdir}
    cp -d ${B}/libqcustomplot.so* ${D}${libdir}

    install -d ${D}${libdir}/pkgconfig
    install -m 0644 ${WORKDIR}/qcustomplot-qt5.pc ${D}${libdir}/pkgconfig/
    sed -i \
        -e 's:%libdir%:${libdir}:g' \
        -e 's:%includedir%:${includedir}:g' \
        ${D}${libdir}/pkgconfig/qcustomplot-qt5.pc

    install -d ${D}${includedir}
    install -m 0644 ${S}/qcustomplot.h ${D}${includedir}/
}

