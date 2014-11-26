require ${BPN}.inc

inherit native

EXTRA_OECMAKE += "-DAUTOTESTS=OFF -DSESSION_MANAGEMENT=OFF"

# we cannot use ${libdir}/${bindir} in native environment - see native.bbclass
CMAKE_HIDE_ERROR[1] = "KF5Config, -s/usr/lib/${BPN}, -S${STAGING_LIBDIR_NATIVE}/${BPN}"
CMAKE_HIDE_ERROR[2] = "KF5Config, -s/usr/lib, -S${STAGING_LIBDIR_NATIVE}"
CMAKE_HIDE_ERROR[3] = "KF5Config, -s/usr/bin, -S${STAGING_BINDIR_NATIVE}"
